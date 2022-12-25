(ns user
  (:require [nextjournal.clerk :as clerk]
            [nextjournal.clerk.config :as config]
            [nextjournal.clerk.view]))

(def index "src/mathbox/examples/index.md")

(defn start! [_]
  (swap! config/!resource->url
         merge
         {"/js/viewer.js" "http://localhost:8766/js/main.js"})
  (clerk/serve!
   {:browse? true
    :watch-paths ["dev"]})
  (Thread/sleep 500)
  (clerk/show! index))
