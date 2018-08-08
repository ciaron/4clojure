(ns fourclojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn test2
  "this is a test function"
  []
  (println "I just say hello"))

;; 4clojure exercises
;; Ex 1 - Nothing but the Truth
(= true true)

(defn ex2
  ;; (= (- 10 (* 2 3)) __)
  []
  (= (- 10 (* 2 3)) 4))

(defn ex3
  ;; (= __ (.toUpperCase "hello world"))
  []
  (= "HELLO WORLD" (.toUpperCase "hello world"))
  )

(defn ex4
  ;; (= (list __) '(:a :b :c))
  []
  (= (list :a :b :c) '(:a :b :c)) 
  )

(defn ex5
  ;; (= __ (conj '(2 3 4) 1))
  ;; (= __ (conj '(3 4) 2 1))
  
  []
  '(1 2 3 4))

(defn ex6
  ;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
  []
  [:a :b :c]
  )

(defn ex7
  ;; (= __ (conj [1 2 3] 4))
  ;; (= __ (conj [1 2] 3 4))
  []
  [ 1 2 3 4 ]
  )

(defn ex8
  ;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
  ;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
  []
  #{ :a :b :c :d }
  )

(defn ex9
  ;; (= #{1 2 3 4} (conj #{1 4 3} __))
  ;;
  []
  2)

(defn ex10
  ;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
  ;; (= __ (:b {:a 10, :b 20, :c 30}))
  []
  20
  )

(defn ex11
  ;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
  []
  {:b 2}
  )

(defn ex12
  ;; (= __ (first '(3 2 1)))
  ;; (= __ (second [2 3 4]))
  ;; (= __ (last (list 1 2 3)))
  []
  3
  )

(defn ex13
  ;; (= __ (rest [10 20 30 40]))
  []
  [20 30 40]
  )
