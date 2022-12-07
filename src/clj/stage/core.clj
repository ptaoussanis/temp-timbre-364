(ns stage.core
  (:require
    [taoensso.timbre :as timbre
      :refer [info warn error spy get-env]])
  (:gen-class))

(defn -main [& args]
  (info "Hello World"))
