(= 3
  (let [[f x] [+ (range 3)]] (apply f x))
  (let [[[f x] b] [[+ 1] 2]] (f x b))
  (let [[f x] [inc 2]] (f x)))
