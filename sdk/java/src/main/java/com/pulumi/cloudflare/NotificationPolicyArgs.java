// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.NotificationPolicyEmailIntegrationArgs;
import com.pulumi.cloudflare.inputs.NotificationPolicyFiltersArgs;
import com.pulumi.cloudflare.inputs.NotificationPolicyPagerdutyIntegrationArgs;
import com.pulumi.cloudflare.inputs.NotificationPolicyWebhooksIntegrationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationPolicyArgs Empty = new NotificationPolicyArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/). Available values: `access_custom_certificate_expiration_type`, `advanced_ddos_attack_l4_alert`, `advanced_ddos_attack_l7_alert`, `bgp_hijack_notification`, `billing_usage_alert`, `block_notification_block_removed`, `block_notification_new_block`, `block_notification_review_rejected`, `clickhouse_alert_fw_anomaly`, `clickhouse_alert_fw_ent_anomaly`, `custom_ssl_certificate_event_type`, `dedicated_ssl_certificate_event_type`, `dos_attack_l4`, `dos_attack_l7`, `expiring_service_token_alert`, `failing_logpush_job_disabled_alert`, `fbm_auto_advertisement`, `fbm_dosd_attack`, `fbm_volumetric_attack`, `health_check_status_notification`, `hostname_aop_custom_certificate_expiration_type`, `http_alert_edge_error`, `http_alert_origin_error`, `load_balancing_health_alert`, `load_balancing_pool_enablement_alert`, `real_origin_monitoring`, `scriptmonitor_alert_new_code_change_detections`, `scriptmonitor_alert_new_hosts`, `scriptmonitor_alert_new_malicious_hosts`, `scriptmonitor_alert_new_malicious_scripts`, `scriptmonitor_alert_new_malicious_url`, `scriptmonitor_alert_new_max_length_resource_url`, `scriptmonitor_alert_new_resources`, `secondary_dns_all_primaries_failing`, `secondary_dns_primaries_failing`, `secondary_dns_zone_successfully_updated`, `secondary_dns_zone_validation_warning`, `sentinel_alert`, `stream_live_notifications`, `tunnel_health_event`, `tunnel_update_event`, `universal_ssl_event_type`, `web_analytics_metrics_update`, `weekly_account_overview`, `workers_alert`, `zone_aop_custom_certificate_expiration_type`.
     * 
     */
    @Import(name="alertType", required=true)
    private Output<String> alertType;

    /**
     * @return The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/). Available values: `access_custom_certificate_expiration_type`, `advanced_ddos_attack_l4_alert`, `advanced_ddos_attack_l7_alert`, `bgp_hijack_notification`, `billing_usage_alert`, `block_notification_block_removed`, `block_notification_new_block`, `block_notification_review_rejected`, `clickhouse_alert_fw_anomaly`, `clickhouse_alert_fw_ent_anomaly`, `custom_ssl_certificate_event_type`, `dedicated_ssl_certificate_event_type`, `dos_attack_l4`, `dos_attack_l7`, `expiring_service_token_alert`, `failing_logpush_job_disabled_alert`, `fbm_auto_advertisement`, `fbm_dosd_attack`, `fbm_volumetric_attack`, `health_check_status_notification`, `hostname_aop_custom_certificate_expiration_type`, `http_alert_edge_error`, `http_alert_origin_error`, `load_balancing_health_alert`, `load_balancing_pool_enablement_alert`, `real_origin_monitoring`, `scriptmonitor_alert_new_code_change_detections`, `scriptmonitor_alert_new_hosts`, `scriptmonitor_alert_new_malicious_hosts`, `scriptmonitor_alert_new_malicious_scripts`, `scriptmonitor_alert_new_malicious_url`, `scriptmonitor_alert_new_max_length_resource_url`, `scriptmonitor_alert_new_resources`, `secondary_dns_all_primaries_failing`, `secondary_dns_primaries_failing`, `secondary_dns_zone_successfully_updated`, `secondary_dns_zone_validation_warning`, `sentinel_alert`, `stream_live_notifications`, `tunnel_health_event`, `tunnel_update_event`, `universal_ssl_event_type`, `web_analytics_metrics_update`, `weekly_account_overview`, `workers_alert`, `zone_aop_custom_certificate_expiration_type`.
     * 
     */
    public Output<String> alertType() {
        return this.alertType;
    }

    /**
     * Description of the notification policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the notification policy.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    @Import(name="emailIntegrations")
    private @Nullable Output<List<NotificationPolicyEmailIntegrationArgs>> emailIntegrations;

    /**
     * @return The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    public Optional<Output<List<NotificationPolicyEmailIntegrationArgs>>> emailIntegrations() {
        return Optional.ofNullable(this.emailIntegrations);
    }

    /**
     * State of the pool to alert on.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return State of the pool to alert on.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
     * 
     */
    @Import(name="filters")
    private @Nullable Output<NotificationPolicyFiltersArgs> filters;

    /**
     * @return An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
     * 
     */
    public Optional<Output<NotificationPolicyFiltersArgs>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The name of the notification policy.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the notification policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    @Import(name="pagerdutyIntegrations")
    private @Nullable Output<List<NotificationPolicyPagerdutyIntegrationArgs>> pagerdutyIntegrations;

    /**
     * @return The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    public Optional<Output<List<NotificationPolicyPagerdutyIntegrationArgs>>> pagerdutyIntegrations() {
        return Optional.ofNullable(this.pagerdutyIntegrations);
    }

    /**
     * The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    @Import(name="webhooksIntegrations")
    private @Nullable Output<List<NotificationPolicyWebhooksIntegrationArgs>> webhooksIntegrations;

    /**
     * @return The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    public Optional<Output<List<NotificationPolicyWebhooksIntegrationArgs>>> webhooksIntegrations() {
        return Optional.ofNullable(this.webhooksIntegrations);
    }

    private NotificationPolicyArgs() {}

    private NotificationPolicyArgs(NotificationPolicyArgs $) {
        this.accountId = $.accountId;
        this.alertType = $.alertType;
        this.description = $.description;
        this.emailIntegrations = $.emailIntegrations;
        this.enabled = $.enabled;
        this.filters = $.filters;
        this.name = $.name;
        this.pagerdutyIntegrations = $.pagerdutyIntegrations;
        this.webhooksIntegrations = $.webhooksIntegrations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPolicyArgs $;

        public Builder() {
            $ = new NotificationPolicyArgs();
        }

        public Builder(NotificationPolicyArgs defaults) {
            $ = new NotificationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param alertType The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/). Available values: `access_custom_certificate_expiration_type`, `advanced_ddos_attack_l4_alert`, `advanced_ddos_attack_l7_alert`, `bgp_hijack_notification`, `billing_usage_alert`, `block_notification_block_removed`, `block_notification_new_block`, `block_notification_review_rejected`, `clickhouse_alert_fw_anomaly`, `clickhouse_alert_fw_ent_anomaly`, `custom_ssl_certificate_event_type`, `dedicated_ssl_certificate_event_type`, `dos_attack_l4`, `dos_attack_l7`, `expiring_service_token_alert`, `failing_logpush_job_disabled_alert`, `fbm_auto_advertisement`, `fbm_dosd_attack`, `fbm_volumetric_attack`, `health_check_status_notification`, `hostname_aop_custom_certificate_expiration_type`, `http_alert_edge_error`, `http_alert_origin_error`, `load_balancing_health_alert`, `load_balancing_pool_enablement_alert`, `real_origin_monitoring`, `scriptmonitor_alert_new_code_change_detections`, `scriptmonitor_alert_new_hosts`, `scriptmonitor_alert_new_malicious_hosts`, `scriptmonitor_alert_new_malicious_scripts`, `scriptmonitor_alert_new_malicious_url`, `scriptmonitor_alert_new_max_length_resource_url`, `scriptmonitor_alert_new_resources`, `secondary_dns_all_primaries_failing`, `secondary_dns_primaries_failing`, `secondary_dns_zone_successfully_updated`, `secondary_dns_zone_validation_warning`, `sentinel_alert`, `stream_live_notifications`, `tunnel_health_event`, `tunnel_update_event`, `universal_ssl_event_type`, `web_analytics_metrics_update`, `weekly_account_overview`, `workers_alert`, `zone_aop_custom_certificate_expiration_type`.
         * 
         * @return builder
         * 
         */
        public Builder alertType(Output<String> alertType) {
            $.alertType = alertType;
            return this;
        }

        /**
         * @param alertType The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/). Available values: `access_custom_certificate_expiration_type`, `advanced_ddos_attack_l4_alert`, `advanced_ddos_attack_l7_alert`, `bgp_hijack_notification`, `billing_usage_alert`, `block_notification_block_removed`, `block_notification_new_block`, `block_notification_review_rejected`, `clickhouse_alert_fw_anomaly`, `clickhouse_alert_fw_ent_anomaly`, `custom_ssl_certificate_event_type`, `dedicated_ssl_certificate_event_type`, `dos_attack_l4`, `dos_attack_l7`, `expiring_service_token_alert`, `failing_logpush_job_disabled_alert`, `fbm_auto_advertisement`, `fbm_dosd_attack`, `fbm_volumetric_attack`, `health_check_status_notification`, `hostname_aop_custom_certificate_expiration_type`, `http_alert_edge_error`, `http_alert_origin_error`, `load_balancing_health_alert`, `load_balancing_pool_enablement_alert`, `real_origin_monitoring`, `scriptmonitor_alert_new_code_change_detections`, `scriptmonitor_alert_new_hosts`, `scriptmonitor_alert_new_malicious_hosts`, `scriptmonitor_alert_new_malicious_scripts`, `scriptmonitor_alert_new_malicious_url`, `scriptmonitor_alert_new_max_length_resource_url`, `scriptmonitor_alert_new_resources`, `secondary_dns_all_primaries_failing`, `secondary_dns_primaries_failing`, `secondary_dns_zone_successfully_updated`, `secondary_dns_zone_validation_warning`, `sentinel_alert`, `stream_live_notifications`, `tunnel_health_event`, `tunnel_update_event`, `universal_ssl_event_type`, `web_analytics_metrics_update`, `weekly_account_overview`, `workers_alert`, `zone_aop_custom_certificate_expiration_type`.
         * 
         * @return builder
         * 
         */
        public Builder alertType(String alertType) {
            return alertType(Output.of(alertType));
        }

        /**
         * @param description Description of the notification policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the notification policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param emailIntegrations The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder emailIntegrations(@Nullable Output<List<NotificationPolicyEmailIntegrationArgs>> emailIntegrations) {
            $.emailIntegrations = emailIntegrations;
            return this;
        }

        /**
         * @param emailIntegrations The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder emailIntegrations(List<NotificationPolicyEmailIntegrationArgs> emailIntegrations) {
            return emailIntegrations(Output.of(emailIntegrations));
        }

        /**
         * @param emailIntegrations The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder emailIntegrations(NotificationPolicyEmailIntegrationArgs... emailIntegrations) {
            return emailIntegrations(List.of(emailIntegrations));
        }

        /**
         * @param enabled State of the pool to alert on.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled State of the pool to alert on.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param filters An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<NotificationPolicyFiltersArgs> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
         * 
         * @return builder
         * 
         */
        public Builder filters(NotificationPolicyFiltersArgs filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param name The name of the notification policy.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the notification policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pagerdutyIntegrations The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder pagerdutyIntegrations(@Nullable Output<List<NotificationPolicyPagerdutyIntegrationArgs>> pagerdutyIntegrations) {
            $.pagerdutyIntegrations = pagerdutyIntegrations;
            return this;
        }

        /**
         * @param pagerdutyIntegrations The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder pagerdutyIntegrations(List<NotificationPolicyPagerdutyIntegrationArgs> pagerdutyIntegrations) {
            return pagerdutyIntegrations(Output.of(pagerdutyIntegrations));
        }

        /**
         * @param pagerdutyIntegrations The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder pagerdutyIntegrations(NotificationPolicyPagerdutyIntegrationArgs... pagerdutyIntegrations) {
            return pagerdutyIntegrations(List.of(pagerdutyIntegrations));
        }

        /**
         * @param webhooksIntegrations The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder webhooksIntegrations(@Nullable Output<List<NotificationPolicyWebhooksIntegrationArgs>> webhooksIntegrations) {
            $.webhooksIntegrations = webhooksIntegrations;
            return this;
        }

        /**
         * @param webhooksIntegrations The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder webhooksIntegrations(List<NotificationPolicyWebhooksIntegrationArgs> webhooksIntegrations) {
            return webhooksIntegrations(Output.of(webhooksIntegrations));
        }

        /**
         * @param webhooksIntegrations The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder webhooksIntegrations(NotificationPolicyWebhooksIntegrationArgs... webhooksIntegrations) {
            return webhooksIntegrations(List.of(webhooksIntegrations));
        }

        public NotificationPolicyArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.alertType = Objects.requireNonNull($.alertType, "expected parameter 'alertType' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
