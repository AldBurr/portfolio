def make_student(studentID, name):
    studentlist = [name, 0, 0.0]
    studentdict = {studentlist:studentID}
    return studentdict
def add_student(population, id, name):
    population[id] = make_student(id, name)
def get_student(population, id):
    if id in population:
        return population[id]
    else:
        return None
def add_credits(population, id, credits):
    student = get_student(population, id)
    if student is not None:
        student[2] += credits
def get_credits(population, id):
    student = get_student(population, id)
    if student is not None:
        return student[2]
def main():
    aldburt = make_student(12345, "Alden Burt")
    johnfallout = make_student(54321, "John Fallout")
    johndestiny = make_student(77777, "Jahn Destiny")
    ethburt = make_student(65432, "Ethan Burt")
    population = {}
    population.append(add_student(population, 12345, "Alden Burt"))
    population.append(add_student(population, 54321, "John Fallout"))
    population.append(add_student(population, 77777, "Jahn Destiny"))
    population.append(add_student(population, 65432, "Ethan Burt"))
    print(population)
main()