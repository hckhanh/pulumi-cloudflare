# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AccessOrganizationArgs', 'AccessOrganization']

@pulumi.input_type
class AccessOrganizationArgs:
    def __init__(__self__, *,
                 auth_domain: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 is_ui_read_only: Optional[pulumi.Input[bool]] = None,
                 login_designs: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 user_seat_expiration_inactive_time: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessOrganization resource.
        :param pulumi.Input[str] auth_domain: The unique subdomain assigned to your Zero Trust organization.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[bool] is_ui_read_only: When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        :param pulumi.Input[str] name: The name of your Zero Trust organization.
        :param pulumi.Input[str] user_seat_expiration_inactive_time: The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        pulumi.set(__self__, "auth_domain", auth_domain)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if is_ui_read_only is not None:
            pulumi.set(__self__, "is_ui_read_only", is_ui_read_only)
        if login_designs is not None:
            pulumi.set(__self__, "login_designs", login_designs)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if user_seat_expiration_inactive_time is not None:
            pulumi.set(__self__, "user_seat_expiration_inactive_time", user_seat_expiration_inactive_time)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="authDomain")
    def auth_domain(self) -> pulumi.Input[str]:
        """
        The unique subdomain assigned to your Zero Trust organization.
        """
        return pulumi.get(self, "auth_domain")

    @auth_domain.setter
    def auth_domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "auth_domain", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="isUiReadOnly")
    def is_ui_read_only(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        """
        return pulumi.get(self, "is_ui_read_only")

    @is_ui_read_only.setter
    def is_ui_read_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_ui_read_only", value)

    @property
    @pulumi.getter(name="loginDesigns")
    def login_designs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]]:
        return pulumi.get(self, "login_designs")

    @login_designs.setter
    def login_designs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]]):
        pulumi.set(self, "login_designs", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of your Zero Trust organization.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="userSeatExpirationInactiveTime")
    def user_seat_expiration_inactive_time(self) -> Optional[pulumi.Input[str]]:
        """
        The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        """
        return pulumi.get(self, "user_seat_expiration_inactive_time")

    @user_seat_expiration_inactive_time.setter
    def user_seat_expiration_inactive_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_seat_expiration_inactive_time", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _AccessOrganizationState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 auth_domain: Optional[pulumi.Input[str]] = None,
                 is_ui_read_only: Optional[pulumi.Input[bool]] = None,
                 login_designs: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 user_seat_expiration_inactive_time: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessOrganization resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[str] auth_domain: The unique subdomain assigned to your Zero Trust organization.
        :param pulumi.Input[bool] is_ui_read_only: When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        :param pulumi.Input[str] name: The name of your Zero Trust organization.
        :param pulumi.Input[str] user_seat_expiration_inactive_time: The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if auth_domain is not None:
            pulumi.set(__self__, "auth_domain", auth_domain)
        if is_ui_read_only is not None:
            pulumi.set(__self__, "is_ui_read_only", is_ui_read_only)
        if login_designs is not None:
            pulumi.set(__self__, "login_designs", login_designs)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if user_seat_expiration_inactive_time is not None:
            pulumi.set(__self__, "user_seat_expiration_inactive_time", user_seat_expiration_inactive_time)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="authDomain")
    def auth_domain(self) -> Optional[pulumi.Input[str]]:
        """
        The unique subdomain assigned to your Zero Trust organization.
        """
        return pulumi.get(self, "auth_domain")

    @auth_domain.setter
    def auth_domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auth_domain", value)

    @property
    @pulumi.getter(name="isUiReadOnly")
    def is_ui_read_only(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        """
        return pulumi.get(self, "is_ui_read_only")

    @is_ui_read_only.setter
    def is_ui_read_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_ui_read_only", value)

    @property
    @pulumi.getter(name="loginDesigns")
    def login_designs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]]:
        return pulumi.get(self, "login_designs")

    @login_designs.setter
    def login_designs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]]):
        pulumi.set(self, "login_designs", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of your Zero Trust organization.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="userSeatExpirationInactiveTime")
    def user_seat_expiration_inactive_time(self) -> Optional[pulumi.Input[str]]:
        """
        The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        """
        return pulumi.get(self, "user_seat_expiration_inactive_time")

    @user_seat_expiration_inactive_time.setter
    def user_seat_expiration_inactive_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_seat_expiration_inactive_time", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class AccessOrganization(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 auth_domain: Optional[pulumi.Input[str]] = None,
                 is_ui_read_only: Optional[pulumi.Input[bool]] = None,
                 login_designs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessOrganizationLoginDesignArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 user_seat_expiration_inactive_time: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A Zero Trust organization defines the user login experience.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.AccessOrganization("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            auth_domain="example.cloudflareaccess.com",
            is_ui_read_only=False,
            login_designs=[cloudflare.AccessOrganizationLoginDesignArgs(
                background_color="#ffffff",
                footer_text="My footer text",
                header_text="My header text",
                logo_path="https://example.com/logo.png",
                text_color="#000000",
            )],
            name="example.cloudflareaccess.com",
            user_seat_expiration_inactive_time="720h")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/accessOrganization:AccessOrganization example <account_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[str] auth_domain: The unique subdomain assigned to your Zero Trust organization.
        :param pulumi.Input[bool] is_ui_read_only: When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        :param pulumi.Input[str] name: The name of your Zero Trust organization.
        :param pulumi.Input[str] user_seat_expiration_inactive_time: The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessOrganizationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A Zero Trust organization defines the user login experience.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.AccessOrganization("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            auth_domain="example.cloudflareaccess.com",
            is_ui_read_only=False,
            login_designs=[cloudflare.AccessOrganizationLoginDesignArgs(
                background_color="#ffffff",
                footer_text="My footer text",
                header_text="My header text",
                logo_path="https://example.com/logo.png",
                text_color="#000000",
            )],
            name="example.cloudflareaccess.com",
            user_seat_expiration_inactive_time="720h")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/accessOrganization:AccessOrganization example <account_id>
        ```

        :param str resource_name: The name of the resource.
        :param AccessOrganizationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessOrganizationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 auth_domain: Optional[pulumi.Input[str]] = None,
                 is_ui_read_only: Optional[pulumi.Input[bool]] = None,
                 login_designs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessOrganizationLoginDesignArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 user_seat_expiration_inactive_time: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessOrganizationArgs.__new__(AccessOrganizationArgs)

            __props__.__dict__["account_id"] = account_id
            if auth_domain is None and not opts.urn:
                raise TypeError("Missing required property 'auth_domain'")
            __props__.__dict__["auth_domain"] = auth_domain
            __props__.__dict__["is_ui_read_only"] = is_ui_read_only
            __props__.__dict__["login_designs"] = login_designs
            __props__.__dict__["name"] = name
            __props__.__dict__["user_seat_expiration_inactive_time"] = user_seat_expiration_inactive_time
            __props__.__dict__["zone_id"] = zone_id
        super(AccessOrganization, __self__).__init__(
            'cloudflare:index/accessOrganization:AccessOrganization',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            auth_domain: Optional[pulumi.Input[str]] = None,
            is_ui_read_only: Optional[pulumi.Input[bool]] = None,
            login_designs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessOrganizationLoginDesignArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            user_seat_expiration_inactive_time: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'AccessOrganization':
        """
        Get an existing AccessOrganization resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[str] auth_domain: The unique subdomain assigned to your Zero Trust organization.
        :param pulumi.Input[bool] is_ui_read_only: When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        :param pulumi.Input[str] name: The name of your Zero Trust organization.
        :param pulumi.Input[str] user_seat_expiration_inactive_time: The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessOrganizationState.__new__(_AccessOrganizationState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["auth_domain"] = auth_domain
        __props__.__dict__["is_ui_read_only"] = is_ui_read_only
        __props__.__dict__["login_designs"] = login_designs
        __props__.__dict__["name"] = name
        __props__.__dict__["user_seat_expiration_inactive_time"] = user_seat_expiration_inactive_time
        __props__.__dict__["zone_id"] = zone_id
        return AccessOrganization(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="authDomain")
    def auth_domain(self) -> pulumi.Output[str]:
        """
        The unique subdomain assigned to your Zero Trust organization.
        """
        return pulumi.get(self, "auth_domain")

    @property
    @pulumi.getter(name="isUiReadOnly")
    def is_ui_read_only(self) -> pulumi.Output[Optional[bool]]:
        """
        When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        """
        return pulumi.get(self, "is_ui_read_only")

    @property
    @pulumi.getter(name="loginDesigns")
    def login_designs(self) -> pulumi.Output[Optional[Sequence['outputs.AccessOrganizationLoginDesign']]]:
        return pulumi.get(self, "login_designs")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of your Zero Trust organization.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="userSeatExpirationInactiveTime")
    def user_seat_expiration_inactive_time(self) -> pulumi.Output[Optional[str]]:
        """
        The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        """
        return pulumi.get(self, "user_seat_expiration_inactive_time")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

