# Coursera -An Introduction to Interactive Programming in Python
# "Guess the number" mini-project
# input will come from buttons and an input field
# all output for the game will be printed in the console
import simplegui
import math
import random



number_range = 100

# helper function to start and restart the game
def new_game():
    # initialize global variables used in your code here
    global secret_number, guess_times
    guess_times = 7
    secret_number = random.randrange(0, number_range)
    


# define event handlers for control panel
def range100():
    # button that changes the range to [0,100) and starts a new game 
    global number_range, guess_times
    guess_times = 7
    number_range = 100
    new_game()
    
def range1000():
    # button that changes the range to [0,1000) and starts a new game     
    global number_range, guess_times
    guess_times = 10
    number_range = 1000
    new_game()   
    
def input_guess(guess):
    # main game logic goes here	
    global guess_num, guess_times
    if(guess_times==0):
        print "Your have run out of chances!"
        print "A new game will be automitically started!"
        new_game()
        return
    guess_num = int(guess)
    print "Guess was " + guess
    print "Number of remaining guesses is " + str(guess_times)
    if(guess_num > secret_number):
        print "Lower!"
    elif(guess_num < secret_number):
        print "Higher!"
    else:
        print "Correct!"
    guess_times = guess_times - 1

    
# create frame
f = simplegui.create_frame("Guess the number", 200, 200)

# register event handlers for control elements and start frame
f.add_button("Range is [0,100) (default)", range100, 200)
f.add_button("Range is [0,1000)", range1000, 200)
f.add_input("Enter a guess", input_guess, 200)

# call new_game 
new_game()


# always remember to check your completed program against the grading rubric