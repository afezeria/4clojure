(= [21 6 1] ((__ + max min) 2 3 5 1 6 4))

(fn [& funcs]
  (fn [& args] 
    (vec (for [f funcs]
              (apply f args)))))