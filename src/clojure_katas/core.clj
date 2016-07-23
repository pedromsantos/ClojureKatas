(ns clojure-katas.core)

(defn fizzBuzz [n] 
  (let [divisible-by? #(= 0 (rem %2 %1))
    divisible-by-three? (divisible-by? 3 n)
    divisible-by-five? (divisible-by? 5 n)
    divisible-by-three-and-five? (divisible-by? 15 n)]
    (cond 
      divisible-by-three-and-five? "fizzbuzz"
      divisible-by-three? "fizz"
      divisible-by-five? "buzz"
      :else (str n))))
