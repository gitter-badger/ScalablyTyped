```
// Type definitions for newrelic 4.11
// Project: http://github.com/newrelic/node-newrelic
// Definitions by: Matt R. Wilson <https://github.com/mastermatt>
//                 Brooks Patton <https://github.com/brookspatton>
//                 Michael Bond <https://github.com/MichaelRBond>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// https://docs.newrelic.com/docs/agents/nodejs-agent/api-guides/nodejs-agent-api
/**
 * Give the current transaction a custom name.
 *
 * Overrides any New Relic naming rules set in configuration or from New Relic's servers.
 *
 * IMPORTANT: this function must be called when a transaction is active. New
 * Relic transactions are tied to web requests, so this method may be called
 * from within HTTP or HTTPS listener functions, Express routes, or other
 * contexts where a web request or response object are in scope.
 *
 * The `name` will be prefixed with 'Custom/' when sent.
 */
```