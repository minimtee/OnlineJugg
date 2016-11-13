'''
Handling Exceptions

The statements try and except can be used to handle selected exceptions. A try statement may have more than one except clause to specify handlers for different exceptions.

#Code
try:
    print 1/0
except ZeroDivisionError as e:
print "Error Code:",e

'''

n = int(raw_input())
lis = [raw_input().split() for x in range(0,n)]
for i in range(0,n):
	try: print(int(lis[i][0])/int(lis[i][1]))
	except ZeroDivisionError as e:
		print "Error Code:",e
	except ValueError as e:
		print "Error Code:",e
