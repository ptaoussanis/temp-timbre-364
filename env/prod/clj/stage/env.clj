(ns stage.env)

(def defaults
  {:init
   (fn [])
   :stop
   (fn [])
   :middleware identity})
