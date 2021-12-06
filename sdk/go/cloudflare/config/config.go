// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

// Configure API client to always use that account
func GetAccountId(ctx *pulumi.Context) string {
	return config.Get(ctx, "cloudflare:accountId")
}

// Configure the base path used by the API client
func GetApiBasePath(ctx *pulumi.Context) string {
	return config.Get(ctx, "cloudflare:apiBasePath")
}

// Whether to print logs from the API client (using the default log library logger)
func GetApiClientLogging(ctx *pulumi.Context) bool {
	v, err := config.TryBool(ctx, "cloudflare:apiClientLogging")
	if err == nil {
		return v
	}
	return getEnvOrDefault(false, parseEnvBool, "CLOUDFLARE_API_CLIENT_LOGGING").(bool)
}

// Configure the hostname used by the API client
func GetApiHostname(ctx *pulumi.Context) string {
	return config.Get(ctx, "cloudflare:apiHostname")
}

// The API key for operations.
func GetApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "cloudflare:apiKey")
}

// The API Token for operations.
func GetApiToken(ctx *pulumi.Context) string {
	return config.Get(ctx, "cloudflare:apiToken")
}

// A special Cloudflare API key good for a restricted set of endpoints
func GetApiUserServiceKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "cloudflare:apiUserServiceKey")
}

// A registered Cloudflare email address
func GetEmail(ctx *pulumi.Context) string {
	return config.Get(ctx, "cloudflare:email")
}

// Maximum backoff period in seconds after failed API calls
func GetMaxBackoff(ctx *pulumi.Context) int {
	v, err := config.TryInt(ctx, "cloudflare:maxBackoff")
	if err == nil {
		return v
	}
	return getEnvOrDefault(30, parseEnvInt, "CLOUDFLARE_MAX_BACKOFF").(int)
}

// Minimum backoff period in seconds after failed API calls
func GetMinBackoff(ctx *pulumi.Context) int {
	v, err := config.TryInt(ctx, "cloudflare:minBackoff")
	if err == nil {
		return v
	}
	return getEnvOrDefault(1, parseEnvInt, "CLOUDFLARE_MIN_BACKOFF").(int)
}

// Maximum number of retries to perform when an API request fails
func GetRetries(ctx *pulumi.Context) int {
	v, err := config.TryInt(ctx, "cloudflare:retries")
	if err == nil {
		return v
	}
	return getEnvOrDefault(3, parseEnvInt, "CLOUDFLARE_RETRIES").(int)
}

// RPS limit to apply when making calls to the API
func GetRps(ctx *pulumi.Context) int {
	v, err := config.TryInt(ctx, "cloudflare:rps")
	if err == nil {
		return v
	}
	return getEnvOrDefault(4, parseEnvInt, "CLOUDFLARE_RPS").(int)
}
