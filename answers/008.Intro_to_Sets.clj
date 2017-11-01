(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))

(= #{:a :b :d :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))