(= (__ [1 2 1 3 1 2 4]) [1 2 3 4])

(= (__ [:a :a :b :b :c :c]) [:a :b :c])

;别人的答案，写了个用循环的，和下面逻辑一样但是太丑了
reduce (fn [s e]
  (if (some #(= % e) s)
    s
    (conj s e)))
[] 