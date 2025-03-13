import csv
import plotter
import re
def plot_grades(filename, first_name, last_name):
    with open(filename) as file:
        csv_reader = csv.reader(file)
        next(csv_reader)
        plotter.init("My Graph", "X-Axis", "Y-axis")
        plotter.new_series("Series One")
        currentlast = re.findall("[a-zA-Z]", last_name)
        currentfirst = re.findall("[a-zA-Z]", first_name)
        lastlist = list(last_name)
        firstlist = list(first_name)     
        if lastlist == currentlast and firstlist == currentfirst:
            colnum = 3
            for nums in csv_reader:
                while colnum < 30:
                    plotter.add_data_point(float(nums[colnum]))
                    colnum += 1
        plotter.plot()
def get_average(filename, colnum):
    with open(filename) as file:
        csv_reader = csv.reader(file)
        next(csv_reader)
        totalnums = 0
        total = 0
        for records in csv_reader:
            total = float(total) + float(records[colnum])
            totalnums +=1
        return(float(total) / float(totalnums))
def plot_class_averages(filename):
        plotter.init("My Graph", "X-Axis", "Y-Axis")
        plotter.new_series("Series One")
        file = filename
        counter = int(4)
        while counter < 30:
            currentavg = get_average(file, int(counter))
            plotter.add_data_point(currentavg)
            counter += 1
        plotter.plot()
def main():
    #plot_grades('data/full_grades_010.csv', 'Myrman', 'Carlyne')
    #print(get_average("data/full_grades_100.csv", 5))
    plot_class_averages('data/full_grades_010.csv')
main()