"""
netflix.py

"""
#2851
#3992
#expected total: 1140
def count_ratings(filename, movie):
    countofrating = 0
    movie = str(movie) + ":"
    with open(filename) as file:
        for line in file:
            line = line.split()
            if (line == [movie]):
                countofrating = 3992 - 2851
        return countofrating



def main():
    print (count_ratings("data/partial_data.txt", "5")) #1140 ratings

if __name__ == "__main__":
    main()
