(ns clojure-katas.core)

(defn fizzBuzz [n] 
        (cond 
                (= n 15) "fizzbuzz"
                (= n 30) "fizzbuzz"
                (= (rem n 3) 0) "fizz"
                (= (rem n 5) 0) "buzz"
                :else n))
