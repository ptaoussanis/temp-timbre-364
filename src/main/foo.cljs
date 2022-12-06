(ns foo
  (:require
   [taoensso.encore :as enc]
   [taoensso.timbre :as timbre]
   [taoensso.timbre.appenders.core]
   ))

(defn init []
  (js/alert    (enc/have string? "hello 1"))
  (timbre/info (enc/have string? "hello 2"))
  )
