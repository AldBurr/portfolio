counter = 0
for index, row in df1:
    if row['BAH'] >= 1411:
        counter += 1
if(counter < maxRows):
    False