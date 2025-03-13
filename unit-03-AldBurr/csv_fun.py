import csv
import plotter
import re
def first_only(filename):
    with open(filename) as file:
        csv_reader = csv.reader(file)
        next(csv_reader)
        for record in csv_reader:
            first = record[0]
            print(first)
def names_and_addresses(filename):
    with open(filename) as file:
        csv_reader = csv.reader(file)
        next(csv_reader)
        for record in csv_reader:
            name = record[0]
            print('Name:', name)
            address = record[1]
            print('Address:', address)
            print()
def averages(filename, colnum):
    with open(filename) as file:
        csv_reader = csv.reader(file)
        next(csv_reader)
        totalrows = 0
        totalgrade = 0
        for counter in csv_reader:
            totalgrade = float(totalgrade) + float(counter[colnum])
            totalrows = totalrows + 1
        return float(totalgrade) / float(totalrows)
def plot_grades(filename, colnum):
    #opens the file in a with loop to get the file open and close once finished
    with open(filename) as file:
        #csv reader created and then skips the first header row
        csv_reader = csv.reader(file)
        next(csv_reader)
         #initialize the plotter with its name and axis info
        plotter.init("My Graph", "X-Axis", "Y-Axis")
        plotter.new_series("Series One")
        for counter in csv_reader:
            currentpoint = counter[colnum]
            #adding all of the grades into the plotter
            plotter.add_data_point(float(currentpoint))
    #plotter.plot()
def zip_check(filename):
    with open(filename) as file:
        csv_reader = csv.reader(file)
        next(csv_reader)
        for code in csv_reader:
            name = code[0]
            address = code[1]
            if re.findall("\\[7-9]\\d{4}", address) == True:
                print("Name:", name)
                print("Address:", address)
            
def main():
    names_and_addresses('data/full_grades_010.csv')
    print('Average grade: ', averages("data/full_grades_010.csv", 3))
    #plot_grades('data/full_grades_010.csv', 3)
    zip_check('data/full_grades_010.csv')
main()
        

