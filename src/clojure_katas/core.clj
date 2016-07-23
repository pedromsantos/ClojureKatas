(ns clojure-katas.core)

(defn fizzBuzz [n] 
        (cond 
                (and (= (rem n 3) 0) (= (rem n 5) 0)) "fizzbuzz"
                (= (rem n 3) 0) "fizz"
                (= (rem n 5) 0) "buzz"
                :else n))
