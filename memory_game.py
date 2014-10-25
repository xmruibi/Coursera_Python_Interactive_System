# implementation of card game - Memory

import simplegui
import random

# helper function to initialize globals

def new_game():
    global exposed, width, card, state, trial, moves, desk
    state = 0
    trial = [None,None]
    moves = 0
    label.set_text("Moves = " + str(moves))
    desk = [card % 8 for card in range(16)]
    random.shuffle(desk)
    exposed=[]
    for i in range(16):
        exposed.append(False)
    width = 800
    

     
# define event handlers
def mouseclick(pos):
    # add game state logic here
    global card, state, trial, desk, moves
    card = pos[0] // 50
    if exposed[card] == False:
        exposed[card] = True
        if state == 0:
            trial[0] = card
            state = 1
        elif state == 1:
            trial[1] = trial[0]
            trial[0] = card
            state = 2
        else:
            if desk[trial[1]] == desk[trial[0]]:
                exposed[trial[0]] = True
                exposed[trial[1]] = True
            else:
                exposed[trial[0]] = False
                exposed[trial[1]] = False
            moves += 1
            label.set_text("Moves = " + str(moves))
            trial[0] = card
            state = 1
    
                        
# cards are logically 50x100 pixels in size    
def draw(canvas):
    global desk, exposed, card
    horzoffset=0  
    index=0 
    for card in desk:
        if exposed[index] == True:
            canvas.draw_text(str(card), (horzoffset+12, 70), 48, "White") 
        elif exposed[index] == False:
            canvas.draw_polygon([(horzoffset+2, 0), (horzoffset+2, 100), (horzoffset+48, 100),(horzoffset+48, 0)],1, "Green", "Green")  
        horzoffset+=50  
        index+=1 


# create frame and add a button and labels
frame = simplegui.create_frame("Memory", 800, 100)
frame.add_button("Reset", new_game)
label = frame.add_label("Turns = 0")

# register event handlers
frame.set_mouseclick_handler(mouseclick)
frame.set_draw_handler(draw)

# get things rolling
new_game()
frame.start()


# Always remember to review the grading rubric