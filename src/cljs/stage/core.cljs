(ns stage.core
  (:require
    [taoensso.timbre :as timbre
      :refer [info warn error spy get-env]]))

(defn init! []
  (info "Hello World!"))
