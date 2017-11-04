(= ((fn [x] (str "hello, " x "!")) "Dave") "hello, Dave!")

(= (#(str "hello, " % "!") "Jenn") "hello, Jenn!")