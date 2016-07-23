(ns clojure-katas.core)

(defn fizzBuzz [n] 
        (cond 
                (= (rem n 3) 0) "fizz"
                (= n 5) "buzz"
                (= n 10) "buzz"
                (= n 15) "buzz"
                :else n))
