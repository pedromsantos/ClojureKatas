(ns clojure-katas.core-test
  (:require [clojure.test :refer :all]
            [clojure-katas.core :refer :all]))

(deftest should-return-one-for-number-1 
  (is (= (fizzBuzz 1) 1))
)

(deftest should-return-two-for-number-2 
  (is (= (fizzBuzz 2) 2))
)

(deftest should-return-fizz-for-number-3 
  (is (= (fizzBuzz 3) "fizz"))
)

(deftest should-return-fizz-for-number-6 
  (is (= (fizzBuzz 6) "fizz"))
)

(deftest should-return-fizz-for-number-9 
  (is (= (fizzBuzz 9) "fizz"))
)
