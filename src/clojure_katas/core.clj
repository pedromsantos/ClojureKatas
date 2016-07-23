(ns clojure-katas.core)

(defn fizzBuzz [n] 
        (let [divisible-by-three? (= (rem n 3) 0)
              divisible-by-five? (= (rem n 5) 0)]
        (cond 
                (and divisible-by-three? divisible-by-five?) "fizzbuzz"
                divisible-by-three? "fizz"
                divisible-by-five? "buzz"
                :else n)))
