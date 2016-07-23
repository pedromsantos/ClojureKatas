(ns clojure-katas.core)

(defn fizzBuzz [n] 
        (cond 
                (= (rem n 3) 0) "fizz"
                :else n))
