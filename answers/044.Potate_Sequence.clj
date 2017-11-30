(= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))

(= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))

(fn [n coll]
  (let [x (mod n (count coll))]
    (concat (drop x coll) (take x coll))))  