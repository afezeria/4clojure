(= true (__ 11))

(= false (__ 88099))

(= true (__ 89089))

(fn [x]
  (let [c (split-at (/ (count (str x)) 2) (map #(- (int %) (int \0)) (str x)))
        f (fn [coll] (reduce + coll))]
    (if (= (count (first c)) (count (second c)))
      (apply = (map f c))
      (= (f (pop (vec (first c)))) (f (second c))))))

(fn [x]
  (let [c (split-at (/ (count (str x)) 2) (map #(- (int %) (int \0)) (str x)))]
   (= 0 (reduce + (apply map #(- %1 %2) c)))))