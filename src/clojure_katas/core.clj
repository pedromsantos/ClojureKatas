(ns clojure-katas.core)

(defn fizzBuzz [n] 
        (cond 
                (= (rem n 3) 0) "fizz"
                (= (rem n 5) 0) "buzz"
                :else n))
