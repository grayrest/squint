(ns my-component-test
  (:require ["vitest" :refer [expect test]]
            [my-lib :refer [adder]]))

(test "my-component adder works"
      (fn []
        (-> (expect (adder 1 2 3))
            (.toBe 6))))
