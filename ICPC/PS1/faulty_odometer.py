


for i in [6012]:
    odo = 0
    miles = 0
    while odo != i:
        odo += 1
        if '4' in str(odo):
            odo = int(str(odo).replace('4', '5'))
        miles += 1
    print miles, odo
