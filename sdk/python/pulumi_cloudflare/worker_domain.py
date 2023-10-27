# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['WorkerDomainArgs', 'WorkerDomain']

@pulumi.input_type
class WorkerDomainArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 hostname: pulumi.Input[str],
                 service: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 environment: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a WorkerDomain resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] hostname: Hostname of the Worker Domain.
        :param pulumi.Input[str] service: Name of worker script to attach the domain to.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] environment: The name of the Worker environment. Defaults to `production`.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "hostname", hostname)
        pulumi.set(__self__, "service", service)
        pulumi.set(__self__, "zone_id", zone_id)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Input[str]:
        """
        Hostname of the Worker Domain.
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: pulumi.Input[str]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter
    def service(self) -> pulumi.Input[str]:
        """
        Name of worker script to attach the domain to.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: pulumi.Input[str]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Worker environment. Defaults to `production`.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment", value)


@pulumi.input_type
class _WorkerDomainState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WorkerDomain resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] environment: The name of the Worker environment. Defaults to `production`.
        :param pulumi.Input[str] hostname: Hostname of the Worker Domain.
        :param pulumi.Input[str] service: Name of worker script to attach the domain to.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if hostname is not None:
            pulumi.set(__self__, "hostname", hostname)
        if service is not None:
            pulumi.set(__self__, "service", service)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Worker environment. Defaults to `production`.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        """
        Hostname of the Worker Domain.
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[str]]:
        """
        Name of worker script to attach the domain to.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class WorkerDomain(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a Worker Custom Domain.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.WorkerDomain("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            hostname="subdomain.example.com",
            service="my-service",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/workerDomain:WorkerDomain example <account_id>/<worker_domain_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] environment: The name of the Worker environment. Defaults to `production`.
        :param pulumi.Input[str] hostname: Hostname of the Worker Domain.
        :param pulumi.Input[str] service: Name of worker script to attach the domain to.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkerDomainArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a Worker Custom Domain.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.WorkerDomain("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            hostname="subdomain.example.com",
            service="my-service",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/workerDomain:WorkerDomain example <account_id>/<worker_domain_id>
        ```

        :param str resource_name: The name of the resource.
        :param WorkerDomainArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkerDomainArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkerDomainArgs.__new__(WorkerDomainArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["environment"] = environment
            if hostname is None and not opts.urn:
                raise TypeError("Missing required property 'hostname'")
            __props__.__dict__["hostname"] = hostname
            if service is None and not opts.urn:
                raise TypeError("Missing required property 'service'")
            __props__.__dict__["service"] = service
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(WorkerDomain, __self__).__init__(
            'cloudflare:index/workerDomain:WorkerDomain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[str]] = None,
            hostname: Optional[pulumi.Input[str]] = None,
            service: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'WorkerDomain':
        """
        Get an existing WorkerDomain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] environment: The name of the Worker environment. Defaults to `production`.
        :param pulumi.Input[str] hostname: Hostname of the Worker Domain.
        :param pulumi.Input[str] service: Name of worker script to attach the domain to.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkerDomainState.__new__(_WorkerDomainState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["environment"] = environment
        __props__.__dict__["hostname"] = hostname
        __props__.__dict__["service"] = service
        __props__.__dict__["zone_id"] = zone_id
        return WorkerDomain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the Worker environment. Defaults to `production`.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Output[str]:
        """
        Hostname of the Worker Domain.
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter
    def service(self) -> pulumi.Output[str]:
        """
        Name of worker script to attach the domain to.
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

