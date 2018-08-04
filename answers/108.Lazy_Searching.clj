(= 4 (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19]))

(= 64 (__ (map #(* % % %) (range)) ;; perfect cubes
          (filter #(zero? (bit-and % (dec %))) (range)) ;; powers of 2
          (iterate inc 20))) ;; at least as large as 20

(defn test [& more]
  (let [coll (sort (apply interleave more))
        x (count more)]
         (ffirst (filter (fn [x] (every? #(= (first x) %) x)) (partition x 1 coll)))))


(defn test [& more]
  (let [coll (sort (apply flatten (vector more)))
        x (count more)]
         (ffirst (filter (fn [x] (every? #(= (first x) %) x)) (partition x 1 coll)))))

;;之前的不是惰性的
(fn  [& args]
  (letfn [(f [m]
             (let [k-fv (map (fn [c] [(first c) (first (second c))]) (seq m))
                   f-vals (map second k-fv)
                   m-val (apply min f-vals)
                   m-keys (map first (filter #(= (second %) m-val) k-fv))]
               (cond
                 (some nil? f-vals) false
                 (apply = f-vals) (first f-vals)
                 :else (merge m (zipmap m-keys (map #(rest (get m %)) m-keys))))))]
    (loop [n (zipmap (range) args)]
      (cond
        (false? n) false
        (not (map? n)) n
        :else (recur (f n))))))

;;别人的答案，一摸一样的思路，快要被自己蠢哭了
(fn [& s]
  ((fn [c]
     (let [f (map first c) m (apply min f)]
       (if (apply = f)
         (ffirst c)
         (recur (map #(if (= m (first %)) (rest %) %) c))))) s))
