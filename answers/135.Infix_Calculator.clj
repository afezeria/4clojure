(= 7 (__ 2 + 5))
(fn infix
  ([a] a)
  ([x f y & args] (apply infix (f x y) args)))
