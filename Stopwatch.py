# An Introduction to Interactive Programming in Python
# "Stopwatch: The Game"
import simplegui
# define global variables
t = 0
x = 0
y = 0
flag = True
# define helper function format that converts time
# in tenths of seconds into formatted string A:BC.D
def format(t):
    fir = t/600
    mid = t/10%60
    if(mid<10):
        mid ="0"+str(mid)
    else:
        mid = str(mid)
    las = t%10
    return str(fir)+":"+mid+"."+str(las)
    
# define event handlers for buttons; "Start", "Stop", "Reset"
def start():
    global flag
    flag = True
    timer.start()
    
def stop():
    global t,x,y,flag
    if(flag):
        flag = False
        y = y+1
        timer.stop()
        if(t%10==0):
          x=x+1
    
def reset():
    global t,x,y,flag
    flag = True
    stop()
    t = 0
    x = 0
    y = 0
    
# define event handler for timer with 0.1 sec interval
def watch():
    global t
    t = t+1

# define draw handler
def draw_handler(canvas):
    global t,x,y
    canvas.draw_text(format(t), [55, 150], 80, 'Red')
    if(y!=0):
        rate = str(float(x)/float(y)*float(100))
    else:
        rate=str(0.0)
    canvas.draw_text("Successful Rate:"+rate[0:4]+"%", [100, 50], 20, 'Red')
# create frame
frame = simplegui.create_frame('Stopwatch', 300, 200)

# register event handlers
button_start = frame.add_button('Start', start, 50)
button_stop = frame.add_button('Stop', stop, 50)
button_reset = frame.add_button('Reset', reset, 50)
timer = simplegui.create_timer(0.1, watch)
frame.set_draw_handler(draw_handler)


# start frame
frame.start()

# Please remember to review the grading rubric