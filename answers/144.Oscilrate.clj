(= (take 3 (__ 3.14 int double)) [3.14 3 3.0])


(fn [x & args]
  ((fn f [n coll]
    (cons n (lazy-seq (f ((first coll) n) (rest coll))))) x (cycle args)))
