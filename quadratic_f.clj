;;;; quadratic_f.clj fings the value of X
;;;;
;;;; Input: Values for A, B, C.
;;;; Output: Outputs the value of X
;;;;
;;;; Usage: clojure -m quadratic_f
;;;; Lorraya Williams
;;;; Date: March 05, 2018
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns quadratic_f)

(defn quadratic [a b c]
  (if ( not=  a 0)
  (let [arg (- (* b b) (* 4 a c))]
    (if (>= arg 0)
    (let [ root1 (/ (- (- b)(Math/sqrt arg)) (* 2 a))
    root2 (/ (+ (- b)(Math/sqrt arg)) (* 2 a)) ]
    (vector root1 root2)
  )
   (print "Cannot find the square root of imaginary numbers"))
  )
 (print "Cannot find x if a is 0"))
)

  (defn -main []
    (print "Enter the value of A: ") (flush)
    (let
      [ a (double (read)) ]                      ; read the string
      (print "Enter the value of B: ") (flush)
      (let
        [ b (double (read))                               ; read the split pos.                  ;  parts
        ]
        (print "Enter the value of C: ") (flush)                                           ; display the parts
        (let [c (double (read))
        results (quadratic a b c)
        root1 (get results 0)
        root2 (get results 1)]
        (println  "\nThe value of x is" root1 " or " root2)
      )
    )
  )
  )
