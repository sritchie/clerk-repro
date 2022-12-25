# clerk-repro

To build custom JS:

```
bb dev-notebook
```

Then, to browse Markdown and see the error:

```
bb start-clerk
```

You should see, in the console:

```
index.js:173 Uncaught TypeError: Cannot read properties of null (reading 'start')
    at isAnimationControls (index.js:173:10)
    at isControllingVariants (index.js:174:34)
    at getCurrentTreeVariants (index.js:178:18)
    at useCreateMotionContext (index.js:233:17)
    at index.js:343:17
    at renderWithHooks (react-dom.development.js:16313:5)
    at updateForwardRef (react-dom.development.js:19250:66)
    at beginWork (react-dom.development.js:21647:38)
    at HTMLUnknownElement.callCallback (react-dom.development.js:4122:25)
    at Object.invokeGuardedCallbackImpl (react-dom.development.js:4224:29)
isAnimationControls @ index.js:173
isControllingVariants @ index.js:174
getCurrentTreeVariants @ index.js:178
useCreateMotionContext @ index.js:233
(anonymous) @ index.js:343
renderWithHooks @ react-dom.development.js:16313
updateForwardRef @ react-dom.development.js:19250
beginWork @ react-dom.development.js:21647
callCallback @ react-dom.development.js:4122
invokeGuardedCallbackImpl @ react-dom.development.js:4224
invokeGuardedCallback @ react-dom.development.js:4475
beginWork$1 @ react-dom.development.js:27622
performUnitOfWork @ react-dom.development.js:26594
workLoopSync @ react-dom.development.js:26565
renderRootSync @ react-dom.development.js:26541
performConcurrentWorkOnRoot @ react-dom.development.js:26497
flushWork @ scheduler.development.js:240
performWorkUntilDeadline @ scheduler.development.js:575




react-dom.development.js:18730 The above error occurred in the <ForwardRef> component:

    at http://localhost:8766/js/cljs-runtime/module$node_modules$framer_motion$dist$cjs$index.js:8:502
    at div
    at div
    at f (http://localhost:8766/js/cljs-runtime/reagent.impl.component.js:739:31)
    at nextjournal.clerk.render.inspect_presented (http://localhost:8766/js/cljs-runtime/reagent.impl.component.js:739:31)
    at nextjournal.clerk.render.inspect_presented (http://localhost:8766/js/cljs-runtime/reagent.impl.component.js:739:31)
    at nextjournal.clerk.render.root (http://localhost:8766/js/cljs-runtime/reagent.impl.component.js:739:31)

Consider adding an error boundary to your tree to customize error handling behavior.
Visit https://reactjs.org/link/error-boundaries to learn more about error boundaries.
```
