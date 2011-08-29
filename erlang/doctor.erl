-module(doctor).
-export([loop/0]).

loop() ->
   process_flag(trap_exit,  true),
   receive
     new ->
       io:format("Creating and monitoring process.~n"),
       register(revolver, spawn_link(fun roulette:loop/0)),
       loop();
     {'EXIT', From, Reson} ->
       io:format("The shooter ~p died with reson ~p.", [From, Reson]),
       io:format(" Restarting.~n"),
       self() ! new,
       loop()
   end.

