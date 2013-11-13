import sys

def fib(n):
  a = 1
  b = 1
  for _ in xrange(n-1):
    a,b = b,a+b
  return b

print fib(int(sys.argv[1]))
