(ns clojure-katas.core)

(defn fizzBuzz [n] 
        (let [divisible-by? (fn [divisor n] (= 0 (rem n divisor)))
              divisible-by-three? (divisible-by? 3 n)
              divisible-by-five? (divisible-by? 5 n)]
        (cond 
                (and divisible-by-three? divisible-by-five?) "fizzbuzz"
                divisible-by-three? "fizz"
                divisible-by-five? "buzz"
                :else n)))
