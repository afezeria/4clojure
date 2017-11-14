(= :gt (__ < 5 1))

(= :eq (__ (fn [x y] (< (count x) (count y))) "pear" "plum"))

(= :lt (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3))

(fn [f x y]
  (cond
    (f y x) :qt
    (f x y) :lt
    :else :eq))
