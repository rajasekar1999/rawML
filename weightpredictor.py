from random import randint
from sklearn.linear_model import LinearRegression
import os

count = 1000

input1 = list()
output = list()

for i in range(count):
     a = randint(145, 185)
     b = randint(25, 45)
     c = randint(0,1)
     #op = randint(45,120)
     if(c==0):
         op = (a-100)*(b/40)
     else:
          op = (a-100)*(b/35)

     input1.append([a,b,c])
     output.append(op)

predictor = LinearRegression(n_jobs = -1)
predictor.fit(X=input1, y=output)

os.system('cls')

ch=1
while ch!=0:
     os.system('cls')
     height = input("Enter your height in centimeters: ")
     #print(height)
     hipsize = input("\nEnter your hip size in centimeters: ")
     #print(hipsize)
     gender = input("\nIf you're a male enter 0; if a female enter 1: ")
     #print(gender)
     test = [[int(height),int(hipsize),int(gender)]]

     outcome = predictor.predict(X=test)

     print('\n\nYour predicted weight is : {}'.format(outcome))

     ch = input('\n\nDo you want to continue? (0/1): ')
