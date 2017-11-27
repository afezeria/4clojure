(== (__ 2 3) 6)

(== (__ 5 3 7) 105)

(fn [& coll]
  (letfn [(f [x y] (let [c (* x y)]
                        (loop [a (max x y) b (min x y) r (mod a b)]
                          (if (zero? r)
                            (/ c b)
                            (recur b r (mod b r))))))]
    (reduce f coll)))

;别人的答案，将最小公约数和最小公倍数拆开的写法
(fn [& args]
  (letfn [(gcd [x y]
            (let [a (max x y)
                  b (min x y)
                  m (mod a b)]
              (if (zero? m)
                b
                (recur b m))))
          (lcm [a b]
            (/ (* a b) (gcd a b)))]
    (reduce lcm args)
    ))

(fn [& nums]
  (let [gcd (fn [a b]
              (cond
                (= b 0) a
                (= a 0) b
                (> a b) (recur b (mod a b))
                :else (recur a (mod b a))))]
    (reduce (fn [a b] (* (/ a (gcd a b)) b)) nums)))