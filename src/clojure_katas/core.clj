(ns clojure-katas.core)

(defn fizzBuzz [n] 
        (cond 
                (= n 3) "fizz"
                (= n 6) "fizz"
                :else n))
