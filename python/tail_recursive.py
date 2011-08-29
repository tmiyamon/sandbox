class tail_recursive(object):
    def __init__(self, func):
        self.func = func
        self.firstcall = True
        self.CONTINUE = object()

    def __call__(self, *args, **kwd):
        if self.firstcall:
            func = self.func
            CONTINUE = self.CONTINUE
            self.firstcall = False
            try:
                while True:
                    result = func(*args, **kwd)
                    print args, kwd
                    if result is CONTINUE:
                        args, kwd = self.argskwd
                    else:
                        return result
            finally:
                self.firstcall = True
        else:
            self.argskwd = args, kwd
            return self.CONTINUE

@tail_recursive
def sum(n, acc = 0):
    if n == 0:
        return acc
    else:
        return sum(n-1, acc+n)

print sum(10)
