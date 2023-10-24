# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ApiShieldSchemaArgs', 'ApiShieldSchema']

@pulumi.input_type
class ApiShieldSchemaArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 source: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 kind: Optional[pulumi.Input[str]] = None,
                 validation_enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ApiShieldSchema resource.
        :param pulumi.Input[str] name: Name of the schema. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] source: Schema file bytes. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] kind: Kind of schema. Defaults to `openapi_v3`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] validation_enabled: Flag whether schema is enabled for validation.
        """
        ApiShieldSchemaArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            source=source,
            zone_id=zone_id,
            kind=kind,
            validation_enabled=validation_enabled,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[pulumi.Input[str]] = None,
             source: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             kind: Optional[pulumi.Input[str]] = None,
             validation_enabled: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if name is None:
            raise TypeError("Missing 'name' argument")
        if source is None:
            raise TypeError("Missing 'source' argument")
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']
        if zone_id is None:
            raise TypeError("Missing 'zone_id' argument")
        if validation_enabled is None and 'validationEnabled' in kwargs:
            validation_enabled = kwargs['validationEnabled']

        _setter("name", name)
        _setter("source", source)
        _setter("zone_id", zone_id)
        if kind is not None:
            _setter("kind", kind)
        if validation_enabled is not None:
            _setter("validation_enabled", validation_enabled)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Name of the schema. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def source(self) -> pulumi.Input[str]:
        """
        Schema file bytes. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: pulumi.Input[str]):
        pulumi.set(self, "source", value)

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
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        Kind of schema. Defaults to `openapi_v3`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter(name="validationEnabled")
    def validation_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag whether schema is enabled for validation.
        """
        return pulumi.get(self, "validation_enabled")

    @validation_enabled.setter
    def validation_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "validation_enabled", value)


@pulumi.input_type
class _ApiShieldSchemaState:
    def __init__(__self__, *,
                 kind: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 validation_enabled: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApiShieldSchema resources.
        :param pulumi.Input[str] kind: Kind of schema. Defaults to `openapi_v3`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] name: Name of the schema. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] source: Schema file bytes. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] validation_enabled: Flag whether schema is enabled for validation.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        _ApiShieldSchemaState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            kind=kind,
            name=name,
            source=source,
            validation_enabled=validation_enabled,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             kind: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             source: Optional[pulumi.Input[str]] = None,
             validation_enabled: Optional[pulumi.Input[bool]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if validation_enabled is None and 'validationEnabled' in kwargs:
            validation_enabled = kwargs['validationEnabled']
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']

        if kind is not None:
            _setter("kind", kind)
        if name is not None:
            _setter("name", name)
        if source is not None:
            _setter("source", source)
        if validation_enabled is not None:
            _setter("validation_enabled", validation_enabled)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        Kind of schema. Defaults to `openapi_v3`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the schema. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        """
        Schema file bytes. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter(name="validationEnabled")
    def validation_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag whether schema is enabled for validation.
        """
        return pulumi.get(self, "validation_enabled")

    @validation_enabled.setter
    def validation_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "validation_enabled", value)

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


class ApiShieldSchema(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 validation_enabled: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to manage a schema in API Shield Schema Validation 2.0.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] kind: Kind of schema. Defaults to `openapi_v3`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] name: Name of the schema. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] source: Schema file bytes. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] validation_enabled: Flag whether schema is enabled for validation.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApiShieldSchemaArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage a schema in API Shield Schema Validation 2.0.

        :param str resource_name: The name of the resource.
        :param ApiShieldSchemaArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApiShieldSchemaArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ApiShieldSchemaArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 validation_enabled: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApiShieldSchemaArgs.__new__(ApiShieldSchemaArgs)

            __props__.__dict__["kind"] = kind
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if source is None and not opts.urn:
                raise TypeError("Missing required property 'source'")
            __props__.__dict__["source"] = source
            __props__.__dict__["validation_enabled"] = validation_enabled
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(ApiShieldSchema, __self__).__init__(
            'cloudflare:index/apiShieldSchema:ApiShieldSchema',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            kind: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            source: Optional[pulumi.Input[str]] = None,
            validation_enabled: Optional[pulumi.Input[bool]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'ApiShieldSchema':
        """
        Get an existing ApiShieldSchema resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] kind: Kind of schema. Defaults to `openapi_v3`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] name: Name of the schema. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] source: Schema file bytes. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] validation_enabled: Flag whether schema is enabled for validation.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApiShieldSchemaState.__new__(_ApiShieldSchemaState)

        __props__.__dict__["kind"] = kind
        __props__.__dict__["name"] = name
        __props__.__dict__["source"] = source
        __props__.__dict__["validation_enabled"] = validation_enabled
        __props__.__dict__["zone_id"] = zone_id
        return ApiShieldSchema(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[Optional[str]]:
        """
        Kind of schema. Defaults to `openapi_v3`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the schema. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[str]:
        """
        Schema file bytes. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter(name="validationEnabled")
    def validation_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Flag whether schema is enabled for validation.
        """
        return pulumi.get(self, "validation_enabled")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

