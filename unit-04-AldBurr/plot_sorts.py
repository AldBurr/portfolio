import list_utils
import plotter
import sorts
import time
def time_sorts(a_list, sort_func):
    start = time.perf_counter()
    sort_func(a_list)
    stop = time.perf_counter()
    return stop - start
def plot_sort_times(title, data):
    plotter.init(title, "N", "Time")
    plotter.new_series("Insertion Sort")
    for vals in data:
        plotter.add_data_point(time_sorts(vals, sorts.insertion_sort))
    plotter.new_series("Merge Sort")
    for vals2 in data:
        plotter.add_data_point(time_sorts(vals2, sorts.merge_sort))
    plotter.new_series("Quick Sort")
    for vals3 in data:
        plotter.add_data_point(time_sorts(vals3, sorts.quicksort))
    plotter.plot(True)
def main():
    randlist = [list_utils.random_list(10001)]
    sortedlist = [range(250, 10001, 250)]
    reversedlist = list(range(10001, 250, -250))
    plot_sort_times("Random List", randlist)
    plot_sort_times("Sorted List", sortedlist)
    plot_sort_times("Reversed List", reversedlist)
main()
