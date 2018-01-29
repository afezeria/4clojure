(= (__ 1 #{4 5 6}) #{#{4} #{5} #{6}})

(= (__ 3 #{0 1 2 3 4}) #{#{0 1 2} #{0 1 3} #{0 1 4} #{0 2 3} #{0 2 4}
                         #{0 3 4} #{1 2 3} #{1 2 4} #{1 3 4} #{2 3 4}})

(= (__ 10 #{4 5 6}) #{})

(fn [x coll]
  (let [f (fn [c1 c2]
            (for [a c1 b c2]
              (clojure.set/union a b)))
        f2 (fn [x c1 c2]
             (filter #(= x (count %)) (set (f c1 c2))))]
    (loop [n 1 
           c1 (map hash-set coll)
           c2 c1]
      (cond 
        (< (count c2) x) #{}
        (= n x) (set c1)
        (< n x) (recur (inc n) (f2 (inc n) c1 c2) c2)))))