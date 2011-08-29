a := Object clone
a talkA := method(
    "A" println
    yield
    "AA" println
    yield
    "AAA" println
    yield
    )

b := Object clone
b talkB := method(
    "B" println
    yield
    "BB" println
    yield
    "BBB" println
    yield
    )

c := Object clone
c talkC := method(
    "C" println
    yield
    "CC" println
    yield
    "CCC" println
    yield
    )

d := Object clone
d talkD := method(
    "D" println
    "DD" println
    "DDD" println
    )

e := Object clone
e talkE := method(
    "E" println
    "EE" println
    "EE" println
    )
a @@talkA; b @@talkB; c @@talkC;d @@talkD;e @@talkE
Coroutine currentCoroutine pause
