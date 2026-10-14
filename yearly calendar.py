import tkinter as tk
import calendar

def draw_calendar(year, month, highlight_day):
    root = tk.Tk()
    root.title(f"Calendar - {month}/{year}")
    
    # Create canvas
    canvas = tk.Canvas(root, width=400, height=300)
    canvas.pack()

    # Get calendar matrix (weeks × days)
    cal = calendar.monthcalendar(year, month)
    
    cell_w, cell_h = 50, 40
    start_x, start_y = 30, 50
    
    # Draw day labels
    days = ["Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"]
    for i, d in enumerate(days):
        canvas.create_text(start_x + i*cell_w, 20, text=d, font=("Arial", 4, "bold"))

    # Draw numbers
    for row, week in enumerate(cal):
        for col, day in enumerate(week):
            if day != 0:  # 0 means no day in that slot
                x = start_x + col*cell_w
                y = start_y + row*cell_h
                canvas.create_text(x, y, text=str(day), font=("Arial", 9))
                
                # Highlight chosen day with circle
                if day == highlight_day:
                    canvas.create_oval(x-15, y-15, x+15, y+15, outline="red", width=2)

    root.mainloop()

# Example: September 2025, circle 10th
draw_calendar(2025, 9, 4)
