(= (__ "something") "something")

(= (__ "multi-word-key") "multiWordKey")

(= (__ "leaveMeAlone") "leaveMeAlone")

(fn [s] (let [coll (re-seq #"\w+" s)]
             (apply str (first coll) (map clojure.string/capitalize (rest coll)))))